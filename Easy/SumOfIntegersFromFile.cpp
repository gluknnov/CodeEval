#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    int sum = 0;
    while(getline(input_stream, input)) {
        sum += stoi(input);
    }
    cout << sum;
    
    return 0;
}
