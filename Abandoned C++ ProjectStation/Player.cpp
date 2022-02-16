#include "Player.h"

Player::Player(std::string name, int mode) : name{ name }, mode{ mode }, isAlive{ true } {
}
Player::operator bool() const {
	return isAlive;
}

std::ostream& operator<<(std::ostream& out, const Player& p)
{
	out << p.name;
	return out;
}
