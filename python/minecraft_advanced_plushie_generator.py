import random

import numpy as np
from PIL import Image
import os

# "INSERT YOUR PATH HERE"
skin_path = os.path.realpath("minecraft_advanced_plushie_generator.py").replace(r"\python\minecraft_advanced_plushie_generator.py",r"\python\minecraft_player_skins")
dir_path = os.path.realpath("minecraft_advanced_plushie_generator.py").replace(r"\python\minecraft_advanced_plushie_generator.py",r"\src\main\resources\assets\plushified\textures\block")


def erase_part_image(im, box):
    for x in range(box[0], box[2]):
        for y in range(box[1], box[3]):
            im.putpixel((x, y), (0, 0, 0, 0))


def put_image(im_source, im, pos=(0, 0)):
    for x in range(im.width):
        for y in range(im.height):
            if x + pos[0] < im_source.width and y + pos[1] < im_source.height: im_source.putpixel((x + pos[0], y + pos[1]), im.getpixel((x, y)))


def create_mini_plushy_UNUSED(file_path):
    with Image.open(file_path).convert("RGBA") as im:
        im_final = Image.new(mode="RGBA", size=(64, 64))

        # head
        im_edit = im.copy().resize((24, 12), Image.NEAREST, (0, 0, 32, 16))
        erase_part_image(im_edit, (0, 0, 6, 6))
        erase_part_image(im_edit, (18, 0, 24, 6))
        put_image(im_final, im_edit, (0, 12))

        # 2nd layer head
        im_edit = im.copy().resize((24, 12), Image.NEAREST, (32, 0, 64, 16))
        erase_part_image(im_edit, (0, 0, 6, 6))
        erase_part_image(im_edit, (18, 0, 24, 6))
        put_image(im_final, im_edit, (0, 0))

        # body
        im_edit = im.copy().resize((12, 8), Image.NEAREST, (16, 16, 40, 32))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (10, 0, 11, 1))
        im_edit_next = im_edit.copy().resize((12, 4), Image.NEAREST, (0, 2, 12, 8))
        erase_part_image(im_edit, (0, 2, 12, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 12, 6)), (24, 6))

        # 2nd layer body
        im_edit = im.copy().resize((12, 8), Image.NEAREST, (16, 32, 40, 48))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (10, 0, 11, 1))
        im_edit_next = im_edit.copy().resize((12, 4), Image.NEAREST, (0, 2, 12, 8))
        erase_part_image(im_edit, (0, 2, 12, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 12, 6)), (24, 18))

        # left arm
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (40, 16, 56, 32))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (0, 24))

        # 2nd layer left arm
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (40, 32, 56, 48))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (18, 0))

        # right arm
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (32, 48, 48, 64))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (8, 24))

        # 2nd layer right arm
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (48, 48, 64, 64))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (26, 0))

        # left leg
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (0, 16, 16, 32))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (0, 30))

        # 2nd layer left leg
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (0, 32, 16, 48))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (18, 12))

        # right leg
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (16, 48, 32, 64))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (8, 30))

        # 2nd layer right leg
        im_edit = im.copy().resize((8, 8), Image.NEAREST, (0, 48, 16, 64))
        erase_part_image(im_edit, (0, 0, 1, 1))
        erase_part_image(im_edit, (6, 0, 7, 1))
        im_edit_next = im_edit.copy().resize((8, 4), Image.NEAREST, (0, 2, 8, 8))
        erase_part_image(im_edit, (0, 2, 8, 8))
        put_image(im_edit, im_edit_next, (0, 2))
        put_image(im_final, im_edit.crop((0, 0, 8, 6)), (26, 12))

        if im_final.getpixel((7, 26))[3] == 0:
            # left arm
            im_new = im_final.copy().crop((6, 26, 7, 30))
            put_image(im_final, im_new, (7, 26))
            im_new = im_final.copy().crop((2, 24, 5, 26))
            put_image(im_final, im_new, (3, 24))

            # 2nd layer left arm
            im_new = im_final.copy().crop((24, 2, 25, 6))
            put_image(im_final, im_new, (25, 2))
            im_new = im_final.copy().crop((20, 0, 23, 2))
            put_image(im_final, im_new, (21, 0))

            # right arm
            im_new = im_final.copy().crop((14, 26, 15, 30))
            put_image(im_final, im_new, (15, 26))
            im_new = im_final.copy().crop((10, 24, 13, 26))
            put_image(im_final, im_new, (11, 24))

            # 2nd layer right arm
            im_new = im_final.copy().crop((32, 2, 33, 6))
            put_image(im_final, im_new, (33, 2))
            im_new = im_final.copy().crop((28, 0, 31, 2))
            put_image(im_final, im_new, (29, 0))

        im_final.save(file_path.replace("skin_", "mini_plush_"))


def create_advanced_plushy(file_path):
    global skin_path
    global dir_path
    with Image.open(file_path).convert("RGBA") as im:
        im_final = Image.new(mode="RGBA", size=(80, 64))
        im_fixed = im.copy()

        # clearing
        erase_part_image(im_fixed, (0, 0, 8, 8))
        erase_part_image(im_fixed, (24, 0, 32, 8))
        erase_part_image(im_fixed, (32, 0, 40, 8))
        erase_part_image(im_fixed, (56, 0, 64, 8))
        erase_part_image(im_fixed, (0, 16, 4, 20))
        erase_part_image(im_fixed, (12, 16, 20, 20))
        erase_part_image(im_fixed, (36, 16, 44, 20))
        erase_part_image(im_fixed, (52, 16, 64, 20))
        erase_part_image(im_fixed, (56, 20, 64, 32))
        erase_part_image(im_fixed, (56, 20, 64, 32))
        erase_part_image(im_fixed, (0, 32, 4, 36))
        erase_part_image(im_fixed, (12, 32, 20, 36))
        erase_part_image(im_fixed, (36, 32, 44, 36))
        erase_part_image(im_fixed, (52, 32, 64, 36))
        erase_part_image(im_fixed, (56, 36, 64, 48))
        erase_part_image(im_fixed, (56, 36, 64, 48))
        erase_part_image(im_fixed, (0, 48, 4, 52))
        erase_part_image(im_fixed, (12, 48, 20, 52))
        erase_part_image(im_fixed, (28, 48, 36, 52))
        erase_part_image(im_fixed, (44, 48, 52, 52))
        erase_part_image(im_fixed, (60, 48, 64, 52))

        if im_fixed.getpixel((55, 31))[3] == 0 or (im_fixed.getpixel((55, 31))[0] == 0 and im_fixed.getpixel((55, 31))[1] == 0 and im_fixed.getpixel((55, 31))[2] == 0):
            # left arm
            im_new = im_fixed.copy().crop((45, 16, 56, 32))
            put_image(im_fixed, im_new, (46, 16))
            im_new = im_fixed.copy().crop((49, 16, 52, 20))
            put_image(im_fixed, im_new, (50, 16))
            im_new = im_fixed.copy().crop((54, 20, 55, 32))
            put_image(im_fixed, im_new, (55, 20))

            # 2nd layer left arm
            im_new = im_fixed.copy().crop((45, 32, 56, 48))
            put_image(im_fixed, im_new, (46, 32))
            im_new = im_fixed.copy().crop((49, 32, 52, 36))
            put_image(im_fixed, im_new, (50, 32))
            im_new = im_fixed.copy().crop((54, 36, 55, 48))
            put_image(im_fixed, im_new, (55, 36))

            # right arm
            im_new = im_fixed.copy().crop((37, 48, 46, 64))
            put_image(im_fixed, im_new, (38, 48))
            im_new = im_fixed.copy().crop((41, 48, 44, 52))
            put_image(im_fixed, im_new, (42, 48))
            im_new = im_fixed.copy().crop((46, 52, 47, 64))
            put_image(im_fixed, im_new, (47, 52))

            # 2nd layer right arm
            im_new = im_fixed.copy().crop((53, 48, 62, 64))
            put_image(im_fixed, im_new, (54, 48))
            im_new = im_fixed.copy().crop((57, 48, 60, 52))
            put_image(im_fixed, im_new, (58, 48))
            im_new = im_fixed.copy().crop((62, 52, 63, 64))
            put_image(im_fixed, im_new, (63, 52))

        # head
        im_edit = im_fixed.copy().resize((40, 20), Image.NEAREST, (0, 0, 32, 16))
        erase_part_image(im_edit, (0, 0, 10, 10))
        erase_part_image(im_edit, (30, 0, 40, 10))
        put_image(im_final, im_edit, (0, 0))
        #put_image(im_final, im_fixed.copy().crop((0, 8, 8, 16)), (1, 11))
        #put_image(im_final, im_fixed.copy().crop((8, 0, 16, 8)), (11, 1))
        #put_image(im_final, im_fixed.copy().crop((8, 8, 16, 16)), (11, 11))
        #put_image(im_final, im_fixed.copy().crop((16, 0, 24, 8)), (21, 1))
        #put_image(im_final, im_fixed.copy().crop((16, 8, 24, 16)), (21, 11))
        #put_image(im_final, im_fixed.copy().crop((24, 8, 32, 16)), (31, 11))

        # 2nd layer head
        im_edit = im_fixed.copy().resize((40, 20), Image.NEAREST, (32, 0, 64, 16))
        erase_part_image(im_edit, (0, 0, 10, 10))
        erase_part_image(im_edit, (30, 0, 40, 10))
        put_image(im_final, im_edit, (40, 0))
        #put_image(im_final, im_fixed.copy().crop((32, 8, 40, 16)), (41, 11))
        #put_image(im_final, im_fixed.copy().crop((40, 0, 48, 8)), (51, 1))
        #put_image(im_final, im_fixed.copy().crop((40, 8, 48, 16)), (51, 11))
        #put_image(im_final, im_fixed.copy().crop((48, 0, 56, 8)), (61, 1))
        #put_image(im_final, im_fixed.copy().crop((48, 8, 56, 16)), (61, 11))
        #put_image(im_final, im_fixed.copy().crop((56, 8, 64, 16)), (71, 11))

        # body
        im_edit = im_fixed.copy().resize((18, 12), Image.NEAREST, (16, 16, 40, 32))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (15, 0, 17, 2))
        im_edit_next = im_edit.copy().resize((18, 5), Image.NEAREST, (0, 3, 18, 12))
        erase_part_image(im_edit, (0, 3, 18, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 18, 8)), (12, 20))

        # 2nd layer body
        im_edit = im_fixed.copy().resize((18, 12), Image.NEAREST, (16, 32, 40, 48))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (15, 0, 17, 2))
        im_edit_next = im_edit.copy().resize((18, 5), Image.NEAREST, (0, 3, 18, 12))
        erase_part_image(im_edit, (0, 3, 18, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 18, 8)), (12, 28))

        # left arm
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (40, 16, 56, 32))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (30, 20))

        # 2nd layer left arm
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (40, 32, 56, 48))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (30, 28))

        # right arm
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (32, 48, 48, 64))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (24, 36))

        # 2nd layer right arm
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (48, 48, 64, 64))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (36, 36))

        # right leg
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (0, 16, 16, 32))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (0, 20))

        # 2nd layer right leg
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (0, 32, 16, 48))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (0, 28))

        # left leg
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (16, 48, 32, 64))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (12, 36))

        # 2nd layer left leg
        im_edit = im_fixed.copy().resize((12, 12), Image.NEAREST, (0, 48, 16, 64))
        erase_part_image(im_edit, (0, 0, 2, 2))
        erase_part_image(im_edit, (10, 0, 12, 2))
        im_edit_next = im_edit.copy().resize((12, 5), Image.NEAREST, (0, 3, 12, 12))
        erase_part_image(im_edit, (0, 3, 12, 12))
        put_image(im_edit, im_edit_next, (0, 3))
        put_image(im_final, im_edit.crop((0, 0, 12, 8)), (0, 36))

        im_final.save(file_path.replace(skin_path,dir_path).replace("skin_", "").replace(".", "_plushie."))


aaaa = "BEHOLD!|BEWARE!|ATTENTION!|NOOOOO!|WOOW!|YO,|BREAKING NEWS!|ALERT!|SPECIAL ANNOUNCEMENT:|IMPORTANT UPDATE:|" \
       "EXCITING NEWS!|URGENT MESSAGE:|IN CASE YOU MISSED IT:|BIG REVEAL:|NOTICE:|YAAAAAYY!|OH MY " \
       "GOD...|*gasp*|WHAT THE F*CK?!|NYAAA~!".split("|")
nooooo = "WAS TURNED INTO MARKETABLE PLUSHY!|GOT SQUISHED INTO A LITTLE BUDDY..|SCREAMS IN PAIN WHILE BEING TURNED" \
         " INTO A PLUSHY!|SAYS: 'AAAAAAAA-' AND BECOMES LITTLE PLUSHY!|TRANSFORMED INTO ADORABLE PLUSHY!|HAS BEEN" \
         " PLUSHIFIED FOR YOUR CUDDLING PLEASURE!|NOW AVAILABLE AS A SOFT AND HUGGABLE PLUSHY!|HAS BEEN TURNED INTO A" \
         " SELLABLE PLUSH TOY!|HAS BEEN IMMORTALIZED AS A PLUSHY!|IS NOW A COLLECTIBLE PLUSHY!|IS NOW A CUTE AND" \
         " SNUGGLY PLUSH TOY!|IS NOW A MARKET-FRIENDLY PLUSHY!|HAS BEEN TRANSFORMED INTO A HIGHLY DESIRABLE" \
         " PLUSHY!|IS NOW AVAILABLE FOR PURCHASE AS A PLUSH TOY!".split("|")
reaction = "(they are going to kill ya)|(they absolutely adore it)|(they are scared)|(they love it)|(and is sooo " \
           "cute)|(and is going to steal your lunch money)|(meeehh)|(look at them, they are adorable)|(this " \
           "little bastard is a murder machine)|(what a cutie)|(their face goes: \":3\")|(soo coooool)|" \
           "(they enjoy it)".split("|")


def get_comment(name):
    global aaaa
    global nooooo
    global reaction
    random.seed(name+"122")
    test_str = str(aaaa[random.randrange(0, len(aaaa))]+" "+name+" "+nooooo[random.randrange(0, len(nooooo))]+" "+reaction[random.randrange(0, len(reaction))])
    return str(test_str)


#def generate_mini_plushies_UNUSED(skin_path):
#    global dir_path
#    if __name__ == "__main__":
#        while True:
#            pythonFiles = [file for dirs in os.walk(skin_path, topdown=True)
#                           for file in dirs[2]]
#            for r in pythonFiles:
#                if not os.path.isfile((dir_path + "\\" + r).replace("skin_", "mini_plush_")) and "skin_" in str(r):
#                    create_mini_plushy(dir_path + "\\" + r)
#                    print(get_comment(r.replace(".png", "").replace("skin_", "").capitalize()))


def generate_advanced_plushies(skin_path):
    if __name__ == "__main__":
        while True:
            pythonFiles = [file for dirs in os.walk(skin_path, topdown=True)
                           for file in dirs[2]]
            for r in pythonFiles:
                if not os.path.isfile((dir_path + "\\" + r).replace("skin_", "").replace(".", "_plushie.")) and "skin_" in str(r):
                    create_advanced_plushy(skin_path + "\\" + r.lower())
                    print(get_comment(r.replace(".png", "").replace("skin_", "").capitalize()))
            quit()


#def generate_all_plushies_UNUSED(dir_path):
#    if __name__ == "__main__":
#        while True:
#            pythonFiles = [file for dirs in os.walk(dir_path, topdown=True)
#                           for file in dirs[2]]
#            for r in pythonFiles:
#                if not (os.path.isfile((dir_path + "\\" + r).replace("skin_", "advanced_plush_")) and os.path.isfile((dir_path + "\\" + r).replace("skin_", "mini_plush_"))) and "skin_" in str(r):
#                    print(get_comment(r.replace(".png", "").replace("skin_", "").capitalize()))
#                if not os.path.isfile((dir_path + "\\" + r).replace("skin_", "advanced_plush_")) and "skin_" in str(r):
#                    create_advanced_plushy(dir_path + "\\" + r)
#                elif not os.path.isfile((dir_path + "\\" + r).replace("skin_", "mini_plush_")) and "skin_" in str(r):
#                    create_mini_plushy(dir_path + "\\" + r)


def get_comments(dir_path):
    if __name__ == "__main__":
        while True:
            pythonFiles = [file for dirs in os.walk(dir_path, topdown=True)
                           for file in dirs[2]]
            for r in pythonFiles:
                if "skin_" in str(r):
                    print(get_comment(r.replace(".png", "").replace("skin_", "").capitalize()))
            quit()


generate_advanced_plushies(skin_path)