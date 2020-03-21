#Base this image on core-image-base
require recipes-core/images/core-image-base.bb

#Only allow for machines which start "rpi"
COMPATIBLE_MACHINE = "^rpi$"

#Install i2c tools
IMAGE_INSTALL += "i2c-tools"

#Install vim
IMAGE_INSTALL += "vim"
