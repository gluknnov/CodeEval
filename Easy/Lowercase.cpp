#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>

using namespace std;

string solve(string &input) {
    for_each(input.begin(), input.end(), [](char &c){ if((c >= 'A') && (c <= 'Z')) c -= 'A' - 'a'; });
    return input;
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
