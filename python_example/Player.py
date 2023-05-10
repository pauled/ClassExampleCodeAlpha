
class Player:

    def __init__(self):
        self.inventory = []
        self.attack_power = 10
        self.max_health = 50
        self.health = self.max_health

    def add_to_inventory(self, item):
        self.inventory.append(item)

    def use_all_items(self):
        for item in self.inventory:
            item.use(self)
