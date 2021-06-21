package it.eplastic.amazonintegration.api.call;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import it.eplastic.amazonintegration.api.obj.error.ErrorResponse;
import it.eplastic.amazonintegration.api.obj.orders.ListOrderItemsResponse;
import it.eplastic.amazonintegration.api.obj.orders.ListOrderResponse;

public class OrderServices {
	
	private static OrderServices me;
	
	private OrderServices() {
	}
	
	public static OrderServices getInstance() {
		if(me==null) {
			me = new OrderServices();
		}
		return me;
	}
	
	public ListOrderResponse callListOrder() throws Exception{
		ListOrderResponse resp = null;
		ListOrderItemsResponse respItems = null;
		ErrorResponse errOrders = null;
		ErrorResponse errItems = null;
        Client client = ClientBuilder.newClient();

        WebTarget targetOrders = client.target(UriBuilder.fromUri("https://mws.amazonservices.jp/Orders/2013-09-01?AWSAccessKeyId=0PB842EXAMPLE7N4ZTR2&Action=ListOrders&MWSAuthToken=amzn.mws.4ea38b7b-f563-7709-4bae-87aeaEXAMPLE&MarketplaceId.Id.1=ATVPDKIKX0DER&MarketplaceId.Id.2=A2Q3Y263D00KWC&MarketplaceId.Id.3=A1VC38T7YXB528&FulfillmentChannel.Channel.1=MFN&PaymentMethod.Method.1=COD&PaymentMethod.Method.2=Other&OrderStatus.Status.1=Unshipped&OrderStatus.Status.2=PendingAvailability&SellerId=A2NEXAMPLETF53&Signature=ZQLpf8vEXAMPLE0iC265pf18n0%3D&SignatureVersion=2&SignatureMethod=HmacSHA256&LastUpdatedAfter=2017-02-01T18%3A12%3A21&Timestamp=2017-02-05T18%3A12%3A21.687Z&Version=2013-09-01").build());
        Response httpResponseOrders = targetOrders.request().accept(MediaType.TEXT_XML).get(Response.class);
        if(httpResponseOrders!=null) {
	        if(httpResponseOrders.getStatus() == Response.Status.OK.getStatusCode()) {
	        	XmlMapper xmlMapper = new XmlMapper();
	        	resp = xmlMapper.readValue(httpResponseOrders.readEntity( String.class ), ListOrderResponse.class);
	        }else{
	        	XmlMapper xmlMapper = new XmlMapper();
	        	errOrders = xmlMapper.readValue(httpResponseOrders.readEntity( String.class ), ErrorResponse.class);
	        	System.out.println("errOrders: "+errOrders.toString());
	        }
        }
        
        WebTarget targetItems= client.target(UriBuilder.fromUri("https://mws.amazonservices.jp/Orders/2013-09-01?AWSAccessKeyId=0PB842EXAMPLE7N4ZTR2&Action=ListOrderItems&MWSAuthToken=amzn.mws.4ea38b7b-f563-7709-4bae-87aeaEXAMPLE&SellerId=A1XEXAMPLE5E6&AmazonOrderId=058-1233752-8214740&Signature=ZQLpf8vEXAMPLE0iC265pf18n0%3D&SignatureVersion=2&SignatureMethod=HmacSHA256&Timestamp=2013-09-05T18%3A12%3A21.687Z&Version=2013-09-01 ").build());
        Response httpResponseItems = targetItems.request().accept(MediaType.TEXT_XML).get(Response.class);
        if(httpResponseItems!=null) {
	        if(httpResponseItems.getStatus() == Response.Status.OK.getStatusCode()) {
	        	XmlMapper xmlMapper = new XmlMapper();
	        	respItems = xmlMapper.readValue(httpResponseItems.readEntity( String.class ), ListOrderItemsResponse.class);
	        }else{
	        	XmlMapper xmlMapper = new XmlMapper();
	        	errItems = xmlMapper.readValue(httpResponseItems.readEntity( String.class ), ErrorResponse.class);
	        	System.out.println("errItems: "+errItems.toString());
	        }
        }
        
        return resp;
	}

}
