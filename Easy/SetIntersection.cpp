#include <iostream>
#include <fstream>
#include <sstream>
#include <algorithm>
#include <vector>

using namespace std;

class ListIterator
{
    vector<int> list;
    int cursor_position;

public:
    ListIterator(string &list_string) {
        replace(list_string.begin(), list_string.end(), ',', ' ');
        int list_elem;
        stringstream list_stream(list_string);
        while(list_stream >> list_elem) {
            list.push_back(list_elem);
        }

        cursor_position = 0;
    }

    int getNumber() {
        return list[cursor_position];
    }

    bool hasNext() {
        return cursor_position + 1 < list.size();
    }

    void nextNumber() {
        cursor_position++;
    }
};

string solve(const string &input) {
    stringstream input_stream(input);
    string list;
    getline(input_stream, list, ';');
    ListIterator list_iterator1(list);
    getline(input_stream, list, ';');
    ListIterator list_iterator2(list);
    
    while((list_iterator1.getNumber() < list_iterator2.getNumber()) && (list_iterator1.hasNext())) {
        list_iterator1.nextNumber();
    }
    while((list_iterator2.getNumber() < list_iterator1.getNumber()) && (list_iterator2.hasNext())) {
        list_iterator2.nextNumber();
    }

    stringstream result;
    while(list_iterator1.getNumber() == list_iterator2.getNumber()) {
        result << list_iterator1.getNumber() << ",";
        if((list_iterator1.hasNext()) && (list_iterator2.hasNext())) {
            list_iterator1.nextNumber();
            list_iterator2.nextNumber();
        }
        else {
            break;
        }
    }

    string result_string = result.str();
    if(result_string.length() > 0) {
        result_string.erase(result_string.length() - 1, 1);
    }
    return result_string;
}

int main(int argc, const char * argv[]) {
    ifstream input_stream(argv[1]);
    string input;
    
    while(getline(input_stream, input)) {
        cout << solve(input) << endl;
    }
    
    return 0;
}
