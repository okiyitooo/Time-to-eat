#ifndef PLAYER
#define PLAYER
#include <iostream>
#include <string>
class Player {
	std::string name;
	int mode;
	bool isAlive;
public:
	Player(std::string name, int mode);
	operator bool() const;
	friend std::ostream& operator<<(std::ostream& out, const Player& p);
};
#endif
