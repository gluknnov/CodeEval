#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

bool isPalindrome(int number) {
    int n = number;
    int reverse_number = 0;
    while (n > 0) {
        reverse_number = reverse_number * 10 + (n % 10);
        n /= 10;
    }

    return reverse_number == number;
}

bool isPrime(int number) {
    for(int i = 2; i < number / 2; i++) {
        if(number % i == 0) {
            return false;
        }
    }

    return true;
}

string solve(const string &input) {
    for(int i = stoi(input) - 1; i >= 0; i--) {
        if(isPrime(i) && isPalindrome(i)) {
            return to_string(i);
        }
    }

    return "1";
}

int main(int argc, const char * argv[]) {
    cout << solve("1000") << endl;
    return 0;
}
