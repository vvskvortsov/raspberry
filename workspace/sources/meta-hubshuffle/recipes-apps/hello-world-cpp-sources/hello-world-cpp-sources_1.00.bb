SUMMARY = "Hello world cpp app sources"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
file://COPYING;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

SRC_URI = "\
file://COPYING \
file://main.cpp \ 
"

#location of the sources
S= "${WORKDIR}"


do_compile() {
   ${CXX} ${CXXFLAGS} main.cpp -o hello-world-cpp-sources ${LDFLAGS}
}

do_install() {
   install -d ${D}${bindir} #creating a directory
   install -m 0755 hello-world-cpp-sources ${D}${bindir}
}
