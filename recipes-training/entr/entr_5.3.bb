SUMMARY = "Tool to run arbitrary commands when files change"
HOMEPAGE = "https://github.com/eradman/entr"
LICENSE = "ISC"

FILESEXTRAPATHS:prepend := "${THISDIR}/patches/:"

SRC_URI += "\
    https://github.com/eradman/entr/archive/refs/tags/${PV}.tar.gz \
    file://0001-system_test-Use-command-pv-rather-than-which.patch \
"
SRC_URI[sha256sum] = "d70b44a23136b87c89bb0079452121e6afdecf6b8f4178c19f2caac3dec3662f"

LIC_FILES_CHKSUM = "file://LICENSE;md5=9ddb37016e12a99202e14ddb69593155"

do_configure() {
    cd "${WORKDIR}/entr-${PV}"
    ./configure
}

do_compile() {
    cd "${WORKDIR}/entr-${PV}"
    make
}

do_install() {
    cd "${WORKDIR}/entr-${PV}"
    make DESTDIR=${D} PREFIX=/usr install
}

# why three separate steps? -> caching, parallism, ..
# introduce ${S}
