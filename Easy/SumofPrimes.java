import java.io.*;

public class Main {
    static Integer primeNumber = 0;
    static Integer prime = 1;
    
    public static Integer get(Integer searchPrimeNumber) {
        if(searchPrimeNumber < primeNumber) {
            primeNumber = 0;
            prime = 1;
        }

        while(!primeNumber.equals(searchPrimeNumber)) {
            prime++;
            boolean isPrime = true;
            for(Integer i = 2; i < prime; i++) {
                if(prime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                primeNumber++;
            }
        }

        return prime;
    }
    
    public static String calculate(String inputLine) {
        Integer input = Integer.parseInt(inputLine);
        Integer result = 0;

        for(Integer i = 1; i <= input; i++) {
            result += get(i);
        }

        return result.toString();
    }
    
    public static void main (String[] args) throws IOException {
        //File file = new File(args[0]);
        //BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line = "1000";
        //while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(calculate(line));
        //}
    }
}
