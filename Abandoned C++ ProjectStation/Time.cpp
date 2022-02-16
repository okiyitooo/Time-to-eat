#include "Time.h"

bool Time::operator <(int i) {
	return hours < i;
}
void Time::operator +=(int hoursToBeAdded) {
	int leftoverdays{ 0 };
	if (hoursToBeAdded > 24) {
		leftoverdays += hoursToBeAdded / 24;
		day += leftoverdays;
		hoursToBeAdded -= leftoverdays * 24;
	}
	hours += hoursToBeAdded;
	if (hours > 24)
		hours = hours - 24;
}
std::ostream& operator << (std::ostream& out, const Time& p) {
	char* timeOfDay{ "" };
	if (p.hours < 12)
		timeOfDay = "Morning";
	else if (p.hours < 16)
		timeOfDay = "Afternoon";
	else if (p.hours < 19)
		timeOfDay = "Evening";
	else
		timeOfDay = "Night";
	out << "DAY: " << p.day << ", " << timeOfDay << ", " << p.hours << " O'Clock ";

	return out;
}