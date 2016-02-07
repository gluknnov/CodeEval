#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

int get_N_prime(int search_prime_number) {
    static int prime_number = 0;
    static int prime = 1;
    
    if(search_prime_number < prime_number) {
        prime_number = 0;
        prime = 1;
    }
    
    while(prime_number != search_prime_number) {
        prime++;
        bool isPrime = true;
        for(int i = 2; i < prime; i++) {
            if(prime % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            prime_number++;
        }
    }
    
    return prime;
}

string solve(int range) {
    int result = 0;
    
    for(int i = 1; i <= range; i++) {
        result += get_N_prime(i);
    }
    
    return std::to_string(result);
}

int main(int argc, char *argv[]) {
    int input = 1000;
    string result = solve(input);
    cout << result << endl;
    return 0;
}
