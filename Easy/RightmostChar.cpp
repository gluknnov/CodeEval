#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

string solve(const string &input) {
    size_t args_delimiter = input.find(",");
    string S = input.substr(0,args_delimiter).c_str();
    char t = input.substr(args_delimiter + 1)[0];

    return to_string((int)S.find_last_of(t));
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
