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
				long charCount = 0;
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				FileWriter fw = new FileWriter(args[0] + ".found");
				BufferedWriter out = new BufferedWriter(fw);
				String line;
				System.out.println("List loaded, checking characters....");
				while ((line = br.readLine()) != null) {
				if((line.startsWith("$H") || line.startsWith("$P$")) && line.length() == 34){
					for (char ch: line.toCharArray()) {
						if(Character.toString(ch).equals("$")){
							out.write(line);
							out.newLine();
							charCount++;
						}
					}
					county++;
				}
			}
				br.close();
				out.close();
				System.out.println("Finished. Lines processed: " + county + " newlines saved " + charCount + ".");
			}
			
		}
	}
