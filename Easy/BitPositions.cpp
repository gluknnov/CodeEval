#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>

using namespace std;

int getBitValue(int number, int bitNumber) {
    return (number >> (bitNumber - 1)) & 1;
}

string solve(string &input) {
    replace(input.begin(), input.end(), ',', ' ');
    istringstream input_stream(input);
    int n, p1, p2;
    input_stream >> n >> p1 >> p2;

    int b1 = getBitValue(n, p1);
    int b2 = getBitValue(n, p2);
    return (b1 == b2) ? "true" : "false";
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
