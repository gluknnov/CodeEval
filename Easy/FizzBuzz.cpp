#include <iostream>
#include <fstream>
#include <sstream>

using namespace std;

string solve(int first_divider, int second_divider, int range) {
    stringstream result;
    for (int i = 1; i <= range; i++) {
        if((i % first_divider == 0) && (i % second_divider == 0)) {
            result << "FB";
        }
        else if(i % first_divider == 0) {
            result << "F";
        }
        else if(i % second_divider == 0) {
            result << "B";
        }
        else {
            result << i;
        }
            
        if(i != range) {
            result << " ";
        }
    }
    return result.str();
}

int main(int argc, const char * argv[]) {
    ifstream input(argv[1]);
    
    int first_divider, second_divider, range;
    while(input >> first_divider >> second_divider >> range) {
        cout << solve(first_divider, second_divider, range) << endl;
    }
    
    return 0;
}
