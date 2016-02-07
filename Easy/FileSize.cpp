#include <iostream>
#include <fstream>

using namespace std;

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1], ios::binary | ios::ate);
    cout << input_stream.tellg();
    
    return 0;
}
