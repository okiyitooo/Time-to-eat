#ifndef PLAYERTIME
#define PLAYERTIME
#include <iostream>
class Time {
	int day;
	int hours;
public:
	Time() : day{ 0 }, hours{ 0 } {}
	Time(int day, int hours) : day{ day }, hours{ hours } {}
	bool operator<(int i);
	void operator +=(int hoursToBeAdded);
	friend std::ostream& operator << (std::ostream& out, const Time& p);
};



#endif
