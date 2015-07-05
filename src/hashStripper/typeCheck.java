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
		if(val.length() == 35 && val.indexOf(":")==33 && val.matches("-?[0-9a-fA-F:]+")){
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
	public static boolean check400(String val){
		if((val.startsWith("$H$") || val.startsWith("$P$")) && val.length() == 34){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean check500(String val){
		if(val.startsWith("$PHPS$") && val.length() == 34){
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
}
