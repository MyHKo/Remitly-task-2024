import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
public class Main{
    public static void main(String[] args) throws Exception{
        if(args.length < 2) {
            try {
                System.out.print(checkResources(args[0]));
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.print("Filename cannot be empty");
                System.exit(1);
            }
        }
        else {
            System.out.print("Only one argument (filename) required");
            System.exit(2);
        }
    }

    public static boolean checkResources(String filename) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(new File(filename));

            if(rootNode.isEmpty())
                throw new Exception("The given file is empty");

            if (rootNode.path("PolicyDocument").path("Statement").path(0).has("Resource")) {
                 return (rootNode.path("PolicyDocument").path("Statement").path(0).get("Resource").asText().equals("*"));
            }
            else
                throw new Exception("The \"Resource\" field is missing in the given file");
        }
        catch (FileNotFoundException e){
            throw new Exception("Could not find the file " + filename);
        }
    }

    public static boolean checkResources(File file) throws Exception{
        if(!file.exists())
            throw new Exception("Given file does not exist");

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(file);

        if(rootNode.isEmpty())
            throw new Exception("The given file is empty");

        if (rootNode.path("PolicyDocument").path("Statement").path(0).has("Resource")) {
            return (rootNode.path("PolicyDocument").path("Statement").path(0).get("Resource").asText().equals("*"));
        }
        else
            throw new Exception("The \"Resource\" field is missing in the given file");
    }
}
