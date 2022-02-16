#pragma once
#include <iostream>
#include <vector>
#include "Food.h"
#include "Activity.h"
#include "Player.h"
#include <algorithm>

class Stage
{	
	Player player;
	int mode;
	Stage();
public:
	Stage(int mode, Player player);
	void askPlayerWhatTheyWantToDo();
	void listFoods(int start, int end);
	void listActivities(int start, int end);
};