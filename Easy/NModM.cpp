#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

string solve(const string &input) {
    size_t delimiter = input.find(",");
    int N = stoi(input.substr(0, delimiter).c_str());
    int M = stoi(input.substr(delimiter + 1).c_str());
    return to_string((int)(N - ((N / M) * M)));
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
