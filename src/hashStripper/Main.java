package hashStripper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class Main {

		private static BufferedWriter hashes_out;
		private static long hashCount = 0;

		public static void main(String[] args) throws IOException{
		
			if(args.length == 0){
				System.out.println("We need args!");
				System.out.println("usage: java -jar hashStripper.jar <dictionary>");
				System.exit(1);
			}
			else{
				int county = 0;
				BufferedReader br = new BufferedReader(new FileReader(args[0]));
				FileWriter hfw = new FileWriter(args[0] + ".hashes.csv");
				hashes_out = new BufferedWriter(hfw);

				FileWriter ofw = new FileWriter(args[0] + ".with_hashes_removed.dic");
				BufferedWriter others_out = new BufferedWriter(ofw);
				
				String line;
				System.out.println("List loaded, checking lines....");
				while ((line = br.readLine()) != null) {
					if(typeCheck.check0(line)){writehash(line, 0);hashCount++; county++;continue;}
					if(typeCheck.check21(line)){writehash(line, 21);hashCount++; county++;continue;}
					if(typeCheck.check112(line)){writehash(line, 112);hashCount++; county++;continue;}
					if(typeCheck.check122(line)){writehash(line, 122);hashCount++; county++; continue;}
					if(typeCheck.check124(line)){writehash(line, 124);hashCount++; county++;continue;}
					if(typeCheck.check200(line)){writehash(line, 200);hashCount++; county++;continue;}
					if(typeCheck.check300(line)){writehash(line, 300);hashCount++; county++;continue;}
					if(typeCheck.check100(line)){writehash(line, 100);hashCount++; county++;continue;}
					if(typeCheck.check400(line)){writehash(line, 400);hashCount++; county++;continue;}
					if(typeCheck.check500(line)){writehash(line, 500);hashCount++; county++;continue;}
					if(typeCheck.check1400(line)){writehash(line, 1400);hashCount++; county++;continue;}
					if(typeCheck.check3200(line)){writehash(line, 3200);hashCount++; county++;continue;}		
					if(typeCheck.check9200(line)){writehash(line, 9200);hashCount++; county++;continue;}
					if(typeCheck.check9300(line)){writehash(line, 9300);hashCount++; county++;continue;}
					
					else{
						others_out.write(line);
						others_out.newLine();
						county++;
					} 
				}
				br.close();
				hashes_out.close();
				others_out.close();
				System.out.println("Finished. Lines processed: " + county + " potential hashes saved " + hashCount + ".");
			}
			
		}

	private static void writehash(String hash, int type) throws IOException{
				//Main.hashes_out.write(type + "\t" + hash);
				Main.hashes_out.write(hash);
					Main.hashes_out.newLine();
						
		}
	}