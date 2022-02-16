#pragma once
#include <iostream>
#include <string>
struct Activity
{
private:
	std::string name;
	int intensity;
	int time;
	bool canGetYouSick;
	int Healthiness;
	Activity();
public:
	Activity(std::string name, int intensity, int time, bool canGetYouSick, int Healthiness);
	friend std::ostream& operator <<  (std::ostream& out, const Activity& a);
};

