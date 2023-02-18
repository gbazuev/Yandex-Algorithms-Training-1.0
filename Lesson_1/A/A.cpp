#include <iostream>
#include <string>

int getResult(std::string type, int roomtemp, int condtemp)
{
    if (type == "freeze")       {return roomtemp < condtemp ? roomtemp : condtemp;}
    else if (type == "heat")    {return roomtemp > condtemp ? roomtemp : condtemp;}
    else if (type == "auto")    {return condtemp;}

    return roomtemp;
}

int main(int argc, const char* argv[]) 
{
	int roomtemp, condtemp;
	std::string condtype;
	std::cin >> roomtemp >> condtemp>>condtype;

	int result = getResult(condtype, roomtemp, condtemp);
	std::cout << result;
	return 0;
}


