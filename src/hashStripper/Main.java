package hashStripper;

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.security.NoSuchAlgorithmException;

	public class Main {

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
				FileWriter ofw = new FileWriter(args[0] + ".hashesremoved");
				BufferedWriter others_out = new BufferedWriter(ofw);
				String line;
				System.out.println("List loaded, checking lines....");
				while ((line = br.readLine()) != null) {
					if((line.startsWith("$H$") || line.startsWith("$P$")) && line.length() == 34){
						//for (char ch: line.toCharArray()) {
						//	if(Character.toString(ch).equals("$")){
								hashes_out.write(line);
								hashes_out.newLine();
								hashCount++;
							}
					else{
						others_out.write(line);
						others_out.newLine();
						hashCount++;
					}
					///	}
						county++;
					}
				br.close();
				hashes_out.close();
				others_out.close();
				System.out.println("Finished. Lines processed: " + county + " potential hashes saved " + hashCount + ".");
			}
			
		}
	}