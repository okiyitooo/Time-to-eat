#ifndef FOOD
#define FOOD
#include <iostream>
#include "Consumables.h"

class Food : public Consumables {
public:
	friend std::ostream& operator << (std::ostream& out, const Food& f);
};
#endif
