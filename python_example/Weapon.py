from GameItem import GameItem

x = 7
print(x)


def method_name():
    pass


class AnotherClass:

    def __init__(self):
        pass


class Weapon(GameItem):

    def __init__(self, weight):
        super().__init__()
        self.weight = weight
        self.description = "Weapon"

    def use(self, player):
        player.attack_power = 1000


def main():
    weapon = Weapon(10.0)
    print(weapon.weight)
    print(weapon.description)


if __name__ == '__main__':
    main()
