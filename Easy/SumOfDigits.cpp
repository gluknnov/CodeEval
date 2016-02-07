#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>

using namespace std;

string solve(string &input) {
    int sum = 0;
    for_each(input.begin(), input.end(), [&sum](char &c){ sum += c - '0'; });
    return to_string(sum);
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
