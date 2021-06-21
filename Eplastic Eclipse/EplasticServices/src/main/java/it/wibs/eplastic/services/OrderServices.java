package it.wibs.eplastic.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import javax.ws.rs.client.ResponseProcessingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jboss.resteasy.spi.ReaderException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import it.wibs.eplastic.bindcommerceIntegration.api.obj.documents.Document;
import it.wibs.eplastic.bindcommerceIntegration.api.obj.documents.DocumentsResponse;
import it.wibs.eplastic.bindcommerceIntegration.api.obj.documents.Row;
import it.wibs.eplastic.entities.CommissionsEntity;
import it.wibs.eplastic.entities.CustomerEntity;
import it.wibs.eplastic.entities.DeliveryAddressEntity;
import it.wibs.eplastic.entities.ItemEntity;
import it.wibs.eplastic.entities.OrderEntity;
import it.wibs.eplastic.entities.OrderItemEntity;
import it.wibs.eplastic.entities.ShippingEntity;
import it.wibs.eplastic.repository.OrderRepo;
import it.wibs.eplastic.utils.DataUtils;

@Service
@Transactional
public class OrderServices {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrderServices.class);

	@Autowired
	OrderRepo orderRepo;

	@Autowired
	ShippingAddressService shipService;

	@Autowired
	DeliveryAddressService deliveryService;

	@Autowired
	CustomerService customerService;

	@Autowired
	CommissionsService commissionsService;

	@Autowired
	OrderItemService orderItemService;

	@Autowired
	ItemService itemService;

	public boolean existsById(String id) {
		return orderRepo.existsById(id);
	}

	public DocumentsResponse getOrderFromFileXml() {
		DocumentsResponse response = new DocumentsResponse();
		//Documents orders = null;
		InputStream inpStream = null;
		BufferedReader rd = null;
		try {
			File file = new File(
					"C:\\Users\\emiliano.mercado\\Eplastic Eclipse\\EplasticServices\\src\\main\\resources\\static\\ordersList.xml");
			inpStream = new FileInputStream(file);
			rd = new BufferedReader(new InputStreamReader(inpStream, StandardCharsets.UTF_8));
			StringBuffer buf = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				buf.append(line);
			}
			// xml file to xmlString
			String XMLString = buf.toString();
			LOGGER.info("stringXml  is: " + XMLString);

			TypeReference<DocumentsResponse> typeReference = new TypeReference<DocumentsResponse>() {};
			//LOGGER.info("getting tpe reference:{} ", DocumentsResponse.class.getName());
			
			if (XMLString != null && !XMLString.isEmpty()) {
				if (XMLString.length() > 10) { // if(xmlMapper.readValue(inpStream, typeReference) != null) {
					JacksonXmlModule module = new JacksonXmlModule();
		            module.setDefaultUseWrapper(false);
		            XmlMapper xmlMapper = new XmlMapper(module);
		            xmlMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		            LOGGER.info("new xml : {}", XMLString);
		            response  = xmlMapper.readValue(XMLString, typeReference);   
					if (response.getDocuments() != null) {
						LOGGER.info(response.getDocuments().size() + "  orders founded ");
						for (Document doc : response.getDocuments()) {
						
							OrderEntity order = new OrderEntity();
							ShippingEntity shipping = new ShippingEntity();
							DeliveryAddressEntity deliveryAddress = new DeliveryAddressEntity();
							CustomerEntity customer = new CustomerEntity();
							CommissionsEntity commission = new CommissionsEntity();
							ItemEntity item = new ItemEntity();
						

							if (doc.getGeneral() != null) {
								LOGGER.info("General information  found={}", doc.getGeneral().toString());
								order.setOrderId(doc.getGeneral().getNumber());
								order.setBindCommerceNumber(doc.getGeneral().getBindCommerceNumber());
								order.setDocumentType(doc.getGeneral().getDocumentType());
								order.setNodeChannel(doc.getGeneral().getNode());
								order.setNodeId(doc.getGeneral().getNodeId());
								order.setTechnology(DataUtils.nvlTrim(doc.getGeneral().getTechnology()));
								order.setMarket(DataUtils.nvlTrim(doc.getGeneral().getMarket()));
								order.setCreationDate(doc.getGeneral().getDate());
								order.setLastUpdate(doc.getGeneral().getLastUpdate());
								order.setStateBindId(doc.getGeneral().getStateBindId());
								order.setOrderStateCode(doc.getGeneral().getStateCode());
								order.setOrderStateName(doc.getGeneral().getStateName());
								LOGGER.info("General information  setted in order as={}", doc.getGeneral().toString());
							}

							if (doc.getCustomer() != null) {
								LOGGER.info("customer  found={}", doc.getCustomer().toString());
								customer.setCustomerCode(doc.getCustomer().getCode());
								customer.setName(doc.getCustomer().getName());
								customer.setSurname(doc.getCustomer().getSurname());
								customer.setAddress(doc.getCustomer().getAddress());
								customer.setPostcode((doc.getCustomer().getPostcode()));
								customer.setCity(doc.getCustomer().getCity());
								customer.setProvince(doc.getCustomer().getProvince());
								customer.setCountryCode(doc.getCustomer().getCountryCode());
								customer.setVatCode(doc.getCustomer().getVatCode());
								customer.setFiscalCode(doc.getCustomer().getFiscalCode());
								customer.setPhone((doc.getCustomer().getPhone()));
								customer.setMobPhone((doc.getCustomer().getMobPhone()));
								customer.setEmail(doc.getCustomer().getEmail());
								order.setCustomerCode(doc.getCustomer().getCode());
								LOGGER.info("order setted customer ="+ customer.toString() );
							}

							if (doc.getDelivery() != null) {
								LOGGER.info("Delivery address found={}", doc.getDelivery().toString());
								deliveryAddress.setOrderId(order.getOrderId());
								deliveryAddress.setName(doc.getDelivery().getName());
								deliveryAddress.setSurname(doc.getDelivery().getSurname());
								deliveryAddress.setCompany(doc.getDelivery().getCompany());
								deliveryAddress.setAddress(doc.getDelivery().getAddress());
								deliveryAddress.setPostcode(doc.getDelivery().getPostcode());
								deliveryAddress.setCity(doc.getDelivery().getCity());
								deliveryAddress.setProvince(doc.getDelivery().getProvince());
								deliveryAddress.setCountryCode(doc.getDelivery().getCountryCode());
								deliveryAddress.setPhone(doc.getDelivery().getPhone());
								deliveryAddress.setMobPhone(doc.getDelivery().getMobPhone());
								deliveryAddress.setEmail(doc.getDelivery().getEmail());
								order.setDeliveryAddress(doc.getDelivery().getAddress());
								LOGGER.info("order setted delivery Address ="+ deliveryAddress.toString() );
							}

							if (doc.getShipping() != null) {
								LOGGER.info("shipping  found {}", doc.getShipping().toString());
								shipping.setOrderId(doc.getGeneral().getNumber());
								shipping.setTrackingNumber(doc.getShipping().getTrackingNumber());
								shipping.setCarrier(doc.getShipping().getCarrier());
								shipping.setTransportedWeight(doc.getShipping().getTransportedWeight());
								shipping.setShippedTime(doc.getShipping().getShippedTime());
								order.setTrackingNumber(shipping.getTrackingNumber());
								LOGGER.info("shipping order setted={}", doc.getShipping().toString());
							}
							if (doc.getPayments() != null) {
								LOGGER.info("order payments found:{} ", doc.getPayments().toString());
								order.setPaymentName(doc.getPayments().getPaymentName());
								order.setPaymentCode(doc.getPayments().getPaymentCode());
								order.setPaymentTotal(doc.getPayments().getPaymentTotal());
								order.setPaymentStatus(doc.getPayments().getPaymentStatus());
								order.setPaidTime(doc.getPayments().getPaidTime());
								LOGGER.info("order payments setted :{} ", doc.getPayments().toString());
							}

							if (doc.getAmounts() != null) {
								LOGGER.info("order amounts found:{} ", doc.getAmounts().toString());
								order.setAmount_totalWithoutTax(doc.getAmounts().getTotalWithoutTax());
								order.setVatAmount(doc.getAmounts().getVatAmount());
								order.setTotal(doc.getAmounts().getTotal());
								order.setCurrency(doc.getAmounts().getCurrency());
								order.setShippingCost(doc.getAmounts().getShippingCost());
								order.setShippingCostWithoutTax(doc.getAmounts().getShippingCostWithoutTax());
								order.setShippingTax(doc.getAmounts().getShippingTax());
								order.setInternalComment(DataUtils.nvlTrim(doc.getAmounts().getInternalComment()));
								order.setSellerNote(DataUtils.nvlTrim(doc.getAmounts().getSellerNote()));
								order.setCouponDiscount(doc.getAmounts().getCouponDiscount());
								order.setCouponCode(DataUtils.nvlTrim(doc.getAmounts().getCouponCode()));
								order.setDiscountToCart(DataUtils.nvlTrim(doc.getAmounts().getDiscountToCart()));
								LOGGER.info("order amounts setted:{} ", doc.getAmounts().toString());
							}

							if (doc.getCommission() != null) {
								LOGGER.info("order commissions found:{} ", doc.getCommission().toString());
								commission.setOrderId(doc.getGeneral().getNumber());
								commission.setPayPalCommission(doc.getCommission().getPayPalCommission());
								commission.setPayPalTransactionId(doc.getCommission().getPayPalTransactionID());
								commission.setEbayCommission(doc.getCommission().getEbayCommission());
								commission.setEbayAccount(doc.getCommission().getEbayAccount());
								commission.setEbayAdjustmentAmount(doc.getCommission().getEbayAdjustmentAmount());
								commission.setEbayAmountSaved(doc.getCommission().getEbayAmountSaved());
								LOGGER.info("order commissions setted:{} ", doc.getCommission().toString());
							}

							if (doc.getRows() != null) {
								LOGGER.info(" Row founded " + doc.getRows().getRowList().toString() );
								int currentRow = 0;
								for (Row itemRow : doc.getRows().getRowList()) {
									OrderItemEntity orderItems = new OrderItemEntity();
									if (itemRow.getCode() != null && !itemRow.getCode().isEmpty()) {
										LOGGER.info("Row details={}", itemRow.toString());
										item.setIdItem(itemRow.getBarcode());
										item.setDescription(itemRow.getDescription());

										if (itemRow.getProductDimensions() != null) {
											item.setWeight(itemRow.getProductDimensions().getWeight());
											item.setWeightUom(itemRow.getProductDimensions().getWeightUom());
											item.setWeightVolume(itemRow.getProductDimensions().getWeightVolume());
											item.setLwhUom(itemRow.getProductDimensions().getLwhUom());
											item.setLength(itemRow.getProductDimensions().getLength());
											item.setWidth(itemRow.getProductDimensions().getWidth());
											item.setHeight(itemRow.getProductDimensions().getHeight());
											item.setCategory(itemRow.getProductCategories().get(0).getCategory());
											try {
												itemService.save(item);
											} catch (Exception e) {
												LOGGER.error("error saving item: ", e);
											}
										}

										orderItems.setBindId(itemRow.getBindId());
										orderItems.setItemCode(itemRow.getCode());
										orderItems.setOrderId(order.getOrderId());
										orderItems.setBarcode(itemRow.getBarcode());
										orderItems.setDescription(itemRow.getDescription());
										orderItems.setQty(itemRow.getQty());
										if (itemRow.getProductCategories() != null) {
											orderItems.setCategory(itemRow.getProductCategories().get(0).getCategory());
										}
										orderItems.setPicture(itemRow.getPicture());
										orderItems.setSupplier(itemRow.getSupplier());
										orderItems.setSupplierByRepricing(itemRow.getSupplierByRepricing());
										orderItems.setSupplierByRepricingCost(itemRow.getSupplierByRepricingCost());
										orderItems.setSupplierPrice(itemRow.getSupplierPrice());
										orderItems.setMpn(itemRow.getMpn());
										orderItems.setPriceVatExcluded(itemRow.getPriceVatExcluded());
										orderItems.setDiscounts(itemRow.getDiscounts());
										orderItems.setVatRate(itemRow.getVatRate());
										orderItems.setTotalVatExcluded(itemRow.getTotalVatExcluded());
										orderItems.setTotal(itemRow.getTotal());
										orderItems.setTotalDiscount(itemRow.getTotalDiscounted());
										orderItems.setCurrency(itemRow.getCurrency());

										if (itemRow.getParams() != null) {
											orderItems.setParamName(itemRow.getParams().getParamList().get(0).getName());
											orderItems.setParamValue(itemRow.getParams().getParamList().get(0).getValue());
										}

										try {
											orderItemService.save(orderItems);
											LOGGER.info("orderItem successfully saved");
										} catch (Exception e) {
											LOGGER.error("error saving orderItem:", e);
											response.setErrorCode(e.getMessage());
											response.setErrorDescription(e.getStackTrace().toString());
										}
										currentRow++;
									} else {
										LOGGER.warn("item is null!!! check document details");
										response.setErrorCode(String.valueOf(HttpStatus.NOT_FOUND));
										response.setErrorDescription(HttpStatus.NOT_FOUND.getReasonPhrase());
									}
								}
						
						} else {
							LOGGER.warn("couldn't find row items");
							response.setErrorCode(String.valueOf(HttpStatus.NOT_FOUND));
							response.setErrorDescription(HttpStatus.NOT_FOUND.getReasonPhrase());
						}

							try {
								save(order);
								LOGGER.debug("saving order{} ", order);
								if(customerService.existById(customer.getCustomerCode())) {
									LOGGER.warn(">>>>>>Customer already exists  as: " + customer.toString() );
								}else {
									customerService.save(customer);
									LOGGER.info("Customer saved as " + customer.toString());
								}
								deliveryService.save(deliveryAddress);
								LOGGER.info("Delivery address saved as :" + deliveryAddress.toString());
								shipService.save(shipping);
								LOGGER.info("shipping saved");
								commissionsService.save(commission);
								LOGGER.info("commissions successfully saved");
								if(existsById(order.getOrderId())) {
									LOGGER.warn("order already exists with this ID, please check details with bindCommerce");
								}else {
									save(order);
									LOGGER.debug("saving order{} ", order);
									LOGGER.info("Order successfully saved ");
									response.setTotalDocumentsfounded(response.getDocuments().size() + " document/s founded ");
								}
								
							} catch (Exception e) {
								LOGGER.error("impossible save order"  , e);
								response.setErrorCode(String.valueOf(HttpStatus.BAD_REQUEST));
								response.setErrorDescription(HttpStatus.BAD_REQUEST.getReasonPhrase());
							}
						}
					} else {
						response.setErrorCode(String.valueOf(HttpStatus.BAD_REQUEST));
						response.setErrorDescription(HttpStatus.BAD_REQUEST.getReasonPhrase());
					}
				}
				return response;
			}
		} catch (ReaderException e) {
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (MismatchedInputException e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (JsonParseException e) {
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (JsonMappingException e) {
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (FileNotFoundException e) {
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (IOException e) {
			LOGGER.error("error IO ", e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			response.setErrorCode(String.valueOf(HttpStatus.CONFLICT));
			response.setErrorDescription(HttpStatus.CONFLICT.getReasonPhrase());
		} finally {
			if (inpStream != null) {
				try {
					inpStream.close();
				} catch (IOException e) {
					LOGGER.error(e.getMessage());
				}
			}
			if (rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
					LOGGER.error(e.getMessage());
				}
			}
		}

		return response;
	}

	public void save(OrderEntity ord) {
		orderRepo.save(ord);
	}

	public DocumentsResponse callOrderList() {
		DocumentsResponse resp = new DocumentsResponse();
		CloseableHttpClient client = HttpClientBuilder.create().build();
		HttpGet httpGet = null;
		HttpResponse httpResponseOrders = null;
		int status = 0;
		try {
			httpGet = new HttpGet("https://.bindcommerce.cloud");
			httpGet.addHeader("Authorization", "Bearer " + resp.getToken());
			LOGGER.info("web target is : " + httpGet.getURI());

			httpResponseOrders = client.execute(httpGet);
			status = httpResponseOrders.getStatusLine().getStatusCode();
			if (httpResponseOrders != null) {
				if (status == 200) {
					XmlMapper xmlMapper = new XmlMapper();
					try {
						resp = xmlMapper.readValue(httpResponseOrders.getEntity().getContent(),
								DocumentsResponse.class);
					} catch (JsonProcessingException e) {
						LOGGER.error(e.toString());
					} catch (UnsupportedOperationException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				} else {
					XmlMapper xmlMapper = new XmlMapper();
					try {
						resp = xmlMapper.readValue(httpResponseOrders.getEntity().getContent(),
								DocumentsResponse.class);
					} catch (JsonProcessingException e) {
						LOGGER.error(e.toString());
					}
					LOGGER.warn("Error! http response with status " + status + " for POST call to rest endpoint ");
				}
			}
		} catch (ResponseProcessingException e) {
			resp.setErrorCode(e.getMessage());
			resp.setErrorDescription(e.getLocalizedMessage());
			LOGGER.error("error getting response: " + e);
		} catch (ClientProtocolException e1) {
			LOGGER.error("error getting response: " + e1);
		} catch (IOException e1) {
			LOGGER.error("error getting response: " + e1);
		}

		return resp;
	}

	@SuppressWarnings("deprecation")
	private JsonNode convertJsonFormat(JSONObject json) {
		ObjectNode ret = JsonNodeFactory.instance.objectNode();

		@SuppressWarnings("unchecked")
		Iterator<String> iterator = json.keys();
		for (; iterator.hasNext();) {
			String key = iterator.next();
			Object value;
			try {
				value = json.get(key);
			} catch (JSONException e) {
				throw new RuntimeException(e);
			}
			if (json.isNull(key))
				ret.putNull(key);
			else if (value instanceof String)
				ret.put(key, (String) value);
			else if (value instanceof Integer)
				ret.put(key, (Integer) value);
			else if (value instanceof Long)
				ret.put(key, (Long) value);
			else if (value instanceof Double)
				ret.put(key, (Double) value);
			else if (value instanceof Boolean)
				ret.put(key, (Boolean) value);
			else if (value instanceof JSONObject)
				ret.put(key, convertJsonFormat((JSONObject) value));
			else if (value instanceof JSONArray)
				ret.put(key, convertJsonFormat((JSONArray) value));
			else
				throw new RuntimeException("not prepared for converting instance of class " + value.getClass());
		}
		return ret;
	}

	private JsonNode convertJsonFormat(JSONArray json) {
		ArrayNode ret = JsonNodeFactory.instance.arrayNode();
		for (int i = 0; i < json.length(); i++) {
			Object value;
			try {
				value = json.get(i);
			} catch (JSONException e) {
				throw new RuntimeException(e);
			}
			if (json.isNull(i))
				ret.addNull();
			else if (value instanceof String)
				ret.add((String) value);
			else if (value instanceof Integer)
				ret.add((Integer) value);
			else if (value instanceof Long)
				ret.add((Long) value);
			else if (value instanceof Double)
				ret.add((Double) value);
			else if (value instanceof Boolean)
				ret.add((Boolean) value);
			else if (value instanceof JSONObject)
				ret.add(convertJsonFormat((JSONObject) value));
			else if (value instanceof JSONArray)
				ret.add(convertJsonFormat((JSONArray) value));
			else
				throw new RuntimeException("not prepared for converting instance of class " + value.getClass());
		}
		return ret;
	}

}
