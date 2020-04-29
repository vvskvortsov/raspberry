#filepath for the original recipe?
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "\
file://full_5.nmconnection \
"

do_install_append() {
#install network config file
	install -m 0600 "${WORKDIR}/full_5.nmconnection" "${D}${sysconfdir}/NetworkManager/system-connections"
}
