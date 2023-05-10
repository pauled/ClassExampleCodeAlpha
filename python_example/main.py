from Weapon import Weapon
from Player import Player
from Potion import Potion

def divide_by_three(x):
    return x / 3


def main():
    x = 7
    x = x + 6
    x += 5

    print(x)
    x = divide_by_three(x)

    print(x)

    player = Player()
    weapon = Weapon(20.0)
    player.add_to_inventory(weapon)
    player.add_to_inventory(Potion(30.0))
    player.add_to_inventory(Potion(5.0))

    player.health = 1

    player.use_all_items()

    print(player.health)
    print(player.attack_power)




if __name__ == '__main__':
    main()
