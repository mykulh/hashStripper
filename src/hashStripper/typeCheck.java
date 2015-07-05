package hashStripper;

public class typeCheck {

	public static boolean check0(String val){
		if(val.length() == 32 && val.matches("-?[0-9a-fA-F]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check21(String val){
		if(val.length() == 35 && val.indexOf(":")==32 && val.matches("-?[0-9a-fA-F:]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check100(String val){
		if(val.length() == 40 && val.matches("-?[0-9a-fA-F]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check112(String val){
		if(val.length() == 61 && val.indexOf(":")==40 && val.matches("-?[0-9a-fA-F:]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check122(String val){
		if(val.length() == 48 && val.startsWith("{SSHA}")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check124(String val){
		if(val.length() == 51 && val.startsWith("sha1$")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check200(String val){
		if(val.length() == 16 && val.matches("-?[0-9a-fA-F]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check300(String val){
		if(val.length() == 40 && val.matches("-?[0-9A-F]+")){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check400(String val){
		if((val.startsWith("$H$") || val.startsWith("$P$")) && val.length() == 34){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check500(String val){
		if(val.startsWith("$PHPS$") && val.length() == 53){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check1400(String val){
		if(val.length() == 64 && val.matches("-?[0-9a-fA-F]+")){
			return true;
		}	
		else{
			return false;
		}
	}
	public static boolean check3200(String val){
		if(val.startsWith("$2a$") && val.length() == 60){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check9200(String val){
		if(val.startsWith("$8$") && val.length() == 61){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check9300(String val){
		if(val.startsWith("$9$") && val.length() == 61){
			return true;
		}
		else{
			return false;
		}
	}
}
