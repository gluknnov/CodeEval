#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

string solve(const string &input) {
    int result = 0;
    int weight = 1;

    for(int i = input.length() - 1; i >= 0; i--) {
        char c = input[i];
        int digit = (c > '9') ? c - 'a' + 10 : c - '0';
        result += digit * weight;
        weight *= 16;
    }

    return to_string(result);
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
