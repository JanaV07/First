# !/usr/bin/python

import os
from stat import S_IREAD, S_IRGRP, S_IROTH

for root, dirs, files in os.walk("e:/may", topdown=False):
    for name in files:
     print(os.path.join(root, name))
     filename=os.path.join(root, name)
     os.chmod(filename, S_IREAD)
    