#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>

using namespace std;

string solve(const string &input) {
    vector<string> words;
    istringstream input_stream(input);
    string word;
    while(input_stream >> word) {
        words.push_back(word);
    }

    stringstream result;
    while(!words.empty()) {
        result << words.back();
        words.pop_back();
        if(!words.empty()) {
            result << " ";
        }
    }
    return result.str();
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
