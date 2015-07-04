package hashStripper;

	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

	public class Main {

		private static BufferedWriter hashes_out;
		@SuppressWarnings("unused")
		private static long hashCount = 0;

		public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
		

			if(args.length == 0){
				System.out.println("We need args!");
				System.out.println("usage: java -jar hashStripper.jar <dictionary>");
				System.exit(1);
			}
			else{
				int county = 0;
				long hashCount = 0;
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				FileWriter hfw = new FileWriter(args[0] + ".hashesfound");
				BufferedWriter hashes_out = new BufferedWriter(hfw);

				FileWriter ofw = new FileWriter(args[0] + ".with_hashes_removed");
				BufferedWriter others_out = new BufferedWriter(ofw);
				
				String line;
				System.out.println("List loaded, checking lines....");
				while ((line = br.readLine()) != null) {
					if(check0(line)){writehash(line, 0);}
					if(check400(line)){writehash(line, 400);}
							
					
					
					else{
						others_out.write(line);
						others_out.newLine();
					}
				  county++;
				}
				br.close();
				hashes_out.close();
				others_out.close();
				System.out.println("Finished. Lines processed: " + county + " potential hashes saved " + hashCount + ".");
			}
			
		}
	private static boolean check0(String val){
			if(val.length() == 32 && val.matches("-?[0-9a-fA-F]+")){
			return true;}
			else{
			return false;
			}
		}
		
	private static boolean check400(String val){
		if((val.startsWith("$H$") || val.startsWith("$P$")) && val.length() == 34){
		return true;}
		else{
		return false;
		}
	}
	
	private static void writehash(String hash, int type) throws IOException{
				Main.hashes_out.write(hash);
					Main.hashes_out.newLine();
						hashCount++;
		}
	}