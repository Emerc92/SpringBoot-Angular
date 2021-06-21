package it.emerc.world.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class DateUtils {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat sdf2 = new SimpleDateFormat("dd.MM.yyyy");
	private static final SimpleDateFormat sdfLong = new SimpleDateFormat("yyyyMMdd");
	private static final SimpleDateFormat sdfLongComplete = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final SimpleDateFormat sdfTime = new SimpleDateFormat("HHmmss");
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DateUtils.class);
	
	public static Date getDateFromLongFormat(long longFormat) throws ParseException{
		if(longFormat==0) {
			return null;
		}
		return getDateFromStringFormat(String.valueOf(longFormat));
    }
	
	public static Date getDateFromLongFormat(long date, long time) throws ParseException{
		if(date==0 || time==0) {
			return null;
		}
        return getDateFromStringFormat(String.valueOf(date), String.valueOf(time));
    }
	
	public static Date getDateFromIntegerFormat(int date) throws ParseException{
		if(date==0) {
			return null;
		}
        return getDateFromStringFormat(String.valueOf(date));
    }
	
	public static Date getDateFromIntegerFormat(int date, int time) throws ParseException{
		if(date==0 || time==0) {
			return null;
		}
		return getDateFromStringFormat(String.valueOf(date), String.valueOf(time));
    }
	
	public static Date getDateFromStringFormat(String stringFormat) throws ParseException{
		String baseDate=StringUtils.leftPad(stringFormat,7,"0");
		int centuryIndex = Integer.valueOf(baseDate.substring(0,1));
		String dateString = (19+centuryIndex) + baseDate.substring(1);
        return sdfLong.parse(dateString);
    }
	
	public static Date getDateFromStringFormat(String date, String time) throws ParseException{
        String dateString = "20" + date.substring(1)+StringUtils.leftPad(time, 6, "0");
        return sdfLongComplete.parse(dateString);
    }

	public static String getStringDateFromLongFormat(long longFormat) throws ParseException{
		if(longFormat==0) {
			return null;
		}
		return sdf.format(getDateFromLongFormat(longFormat));
	}
	
	public static String getStringDateFromLongFormat2(long longFormat) throws ParseException{
		if(longFormat==0) {
			return null;
		}
		return sdf2.format(getDateFromLongFormat(longFormat));
	}
	
	public static String getStringDateFromLongFormatNoExc(long longFormat){
		String ret = "";
		try {
			ret = getStringDateFromLongFormat(longFormat);
		}catch(ParseException pe) {
			LOGGER.warn("Error parsing date {}",longFormat,pe);
		}
		return ret;
	}
	
	public static long getLongDateFormatFromDate(Date date) {
		if(date==null) {
			return 0L;
		}
		String dtstring = sdfLong.format(date);
		return Long.valueOf("1"+dtstring.substring(2));
	}
	
	public static long getLongDateFormatFromStringyyyyMMdd(String dtstring) {
		if(dtstring==null) {
			return 0L;
		}
		return Long.valueOf("1"+dtstring.substring(2));
	}
	
	public static final boolean checkDateLongFormat(String strToChek) {
		if(strToChek==null) {
			return false;
		}
		return strToChek.matches("^1\\d{2}[0-1]{1}\\d{1}[0-3]{1}\\d{1}$");
	}
	
	public static String formatDoubleStringNoComma(Double d, int decimals) {
		if(d==null || d==0.0) {
			return "0"+StringUtils.rightPad("0", decimals, "0");
		}
		String[] splitted = String.valueOf(d).split("\\.");
		String decimalPart = splitted[1].length()>decimals?splitted[1].substring(0,2):StringUtils.rightPad(splitted[1], decimals, "0");
		return splitted[0]+decimalPart;
	}
	
	public static String formatDoubleString(Double d) {
		return formatDoubleStringDecimalSeparator(d, 2, ",");
	}
	
	public static String formatDoubleStringDecimalSeparator(Double d, int decimals, String decimalSeparator) {
		if(d==null || d==0.0) {
			return "0"+decimalSeparator+StringUtils.rightPad("0", decimals, "0");
		}
		String[] splitted = String.valueOf(d).split("\\.");
		String decimalPart = splitted[1].length()>decimals?splitted[1].substring(0,2):StringUtils.rightPad(splitted[1], decimals, "0");
		return splitted[0]+decimalSeparator+decimalPart;
	}
	
	public static String upperNvl(String s) {
		return nvl(s).toUpperCase();
	}
	
	public static String upper(String s) {
		if(s==null) {
			return null;
		}
		return s.toUpperCase();
	}
	
	public static String lower(String s) {
		if(s==null) {
			return null;
		}
		return s.toLowerCase();
	}
	
	public static String nvl(String s) {
		if(s==null) {
			return "";
		}
		return s.trim();
	}
	
	public static String nvlToString(Object s) {
		if(s==null) {
			return "";
		}
		return s.toString().trim();
	}
	
	public static String getTimerTillNow(Date dt) {
		Date now = new Date();
		long millis = now.getTime()-dt.getTime();
		if(millis>0) {
			return convertMillisToTimer(millis);
		}else {
			return "00:00:00";
		}
	}
	
	public static String convertMillisToTimer(long millis) {
		return convertSecondsToTimer(millis/1000);
	}
	
	public static String convertSecondsToTimer(long sec) {
		long secondi = sec%60;
		long minuti = (sec/60)%60;
		long ore = sec/(60*60);
		String timeString = StringUtils.leftPad(String.valueOf(ore), 2, "0")+":"+StringUtils.leftPad(String.valueOf(minuti), 2, "0")+":"+StringUtils.leftPad(String.valueOf(secondi), 2, "0");
		return timeString;
	}
	
	public static String formatyyyyMMddDateString(String date) {
		if(date == null || date.trim().length()!=8) {
			return date;
		}
		return date.trim().substring(6)+"-"+date.trim().substring(4,6)+"-"+date.trim().substring(0,4);
	}
	
	public static String getStringTimeFromLongFormat(long longFormat) throws ParseException{
		if(longFormat==0) {
			return null;
		}
		String str = StringUtils.leftPad(String.valueOf(longFormat), 6, "0");
		return str.substring(0,2)+":"+str.substring(2,4)+":"+str.substring(4);
	}
	
	public static long getLongTimeFromDate(Date date) {
		if (date == null) {
			return 0L;
		}
		return Long.valueOf(sdfTime.format(date));
	}
	
	public static long getLongFromStringddMMyyyy(String ddMMyyyyy) throws ParseException{
		Date dt = sdf.parse(ddMMyyyyy);
		return getLongDateFormatFromDate(dt);
	}
	
	public static boolean isEmpty(String val) {
		return "".equals(nvl(val));
	}
	
	
	public static int giorniDifferenza(Calendar cal1, Calendar cal2){
		long ldate1 = cal1.getTime().getTime() + cal1.get(Calendar.ZONE_OFFSET) + cal1.get(Calendar.DST_OFFSET);
		long ldate2 = cal2.getTime().getTime() + cal2.get(Calendar.ZONE_OFFSET) + cal2.get(Calendar.DST_OFFSET);
		int hr1   = (int)(ldate1/3600000);
		int hr2   = (int)(ldate2/3600000);
		int days1 = (int)hr1/24;
		int days2 = (int)hr2/24;
		int dateDiff  = days2 - days1;
		return dateDiff;
	}
	
	
	
}
