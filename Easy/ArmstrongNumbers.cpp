#include <iostream>
#include <fstream>
#include <sstream>
#include <cmath>

using namespace std;

string solve(const string &input) {
    int powExponent = input.length();
    long sum = 0L;
    for(int i = 0; i < input.length(); i++) {
        sum += floor(pow(input[i] - '0', powExponent));
    }

    return (sum == (stol(input))) ? "True" : "False";
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
