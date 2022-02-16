#include "Activity.h"

Activity::Activity(std::string name, int intensity, int time, bool canGetYouSick, int Healthiness) 
    : name{ name }, intensity{intensity}, time{time}, canGetYouSick{canGetYouSick}, Healthiness{Healthiness}
{
}
std::ostream& operator<<(std::ostream& out, const Activity& a)
{
    out << a.name << " Intensity: " << a.intensity<< " Time: " << a.time;
    return out;
}

