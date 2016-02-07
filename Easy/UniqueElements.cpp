#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

string solve(const string &input) {
    stringstream result;
    string last_unique_elem;
    stringstream cur_elem_stream;
    for(int i = 0; i < input.size(); i++) {
        char c = input[i];
        if(c != ',') {
            cur_elem_stream << c;
        }
        else {
            string cur_elem = cur_elem_stream.str();
            if(cur_elem != last_unique_elem) {
                result << cur_elem << ",";
                last_unique_elem = cur_elem;
            }
            cur_elem_stream.str(string());
        }
    }

    string cur_elem = cur_elem_stream.str();
    if(cur_elem != last_unique_elem) {
        result << cur_elem << ",";
    }

    string result_string = result.str();
    return result_string.erase(result_string.length() - 1, 1);
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
