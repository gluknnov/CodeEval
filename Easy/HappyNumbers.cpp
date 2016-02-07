#include <iostream>
#include <fstream>
#include <sstream>
#include <set>

using namespace std;

bool isHappy(int number) {
    return number == 1;
}

int getNextNumber(int number) {
    int sum = 0;
    while (number > 0) {
        sum += (number % 10) * (number % 10);
        number /= 10;
    }
        
    return sum;
}

string solve(const string &input) {
    int number = stoi(input);
    set<int> generated_numbers;

    while ((!isHappy(number)) && (generated_numbers.find(number) == generated_numbers.end())) {
        generated_numbers.insert(number);
        number = getNextNumber(number);
    }

    return isHappy(number) ? "1" : "0";
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
