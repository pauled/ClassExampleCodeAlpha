from GameItem import GameItem


class Potion(GameItem):

    def __init__(self, weight):
        super().__init__()
        self.weight = weight
        self.description = "Potion"

    def use(self, player):
        player.health = min(player.max_health, player.health + self.weight)
