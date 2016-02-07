#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

int getDigitCount(const string &input, int digit) {
    int count = 0;

    for(int i = 0; i < input.length(); i++) {
        if(input[i] - '0' == digit) {
            count++;
        }
    }

    return count;
}

string solve(const string &input) {
    for(int i = 0; i < input.length(); i++) {
        int expectedCount = input[i] - '0';
        int actualCount = getDigitCount(input, i);
        if(expectedCount != actualCount) {
            return "0";
        }
    }

    return "1";
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
