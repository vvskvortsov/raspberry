#Base this image on core-image-base
require recipes-core/images/core-image-base.bb

#Only allow for machines which start "rpi"
COMPATIBLE_MACHINE = "^rpi$"

#change root password
inherit extrausers
EXTRA_USERS_PARAMS = "\
usermod -p \\\$1\\\$sFvV2uA0\\\$yjImBGEl3aEJEp.FQ56.T1 root \
"

#only produce the rdi-sdimg image format
IMAGE_FSTYPE = "rpi-sdi"

#remove old builds
RM_OLD_IMAGE = "1"

#remove the splash screen
IMAGE_FEATURES_remove = "splash"

#print this message ince do_rootfs() has completed
do_rootfs_append() {
    bb.warn("an image has freahly built")
}


#add support for wifi and bluetooth (iit was a linux-firmware also but we romove it as it takes much space)
IMAGE_INSTALL_append += "linux-firmware-bcm43430 "

#install kernel-modules
IMAGE_INSTALL_append = "kernel-modules "

#install ssh
IMAGE_FEATURES += "ssh-server-dropbear "


#Install i2c tools
IMAGE_INSTALL_append = "i2c-tools "

#Install vim
IMAGE_INSTALL_append += "vim "

#Install tzdata
IMAGE_INSTALL_append += "tzdata tzdata-europe "



#install network-manager
IMAGE_INSTALL_append += "networkmanager networkmanager-nmtui networkmanager-bash-completion "


#install cpp hello world - sources version
IMAGE_INSTALL_append += "hello-world-cpp-sources "

#install cpp hello world - makefile version
IMAGE_INSTALL_append += "hello-world-cpp-makefile "

#install python flask hello world
IMAGE_INSTALL_append += "python-flask-hello-world "

