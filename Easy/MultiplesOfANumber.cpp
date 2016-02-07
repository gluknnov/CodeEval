#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>

using namespace std;

string solve(string &input) {
    replace(input.begin(), input.end(), ',', ' ');
    istringstream input_stream(input);
    int x, n;
    input_stream >> x >> n;

    int result = 0;
    while (result < x) {
        result += n;
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
