class GameItem:
    cost = 0.0

    def __init__(self):
        self.weight = 0.0
        self.description = "default description"

    def use(self, player):
        pass


if __name__ == '__main__':
    print(GameItem.cost)
