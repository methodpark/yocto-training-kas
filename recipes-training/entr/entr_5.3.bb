SUMMARY = "Tool to run arbitrary commands when files change"
HOMEPAGE = "https://github.com/eradman/entr"
LICENSE = "ISC"

LIC_FILES_CHKSUM = "file://LICENSE;md5=9ddb37016e12a99202e14ddb69593155"

FILESEXTRAPATHS:prepend := "${THISDIR}/patches/:"

SRC_URI += "\
    git://github.com/eradman/entr.git;branch=master;rev=${SRCREV};protocol=https \
    file://0001-system_test-Use-command-pv-rather-than-which.patch \
"
SRC_URI[sha256sum] = "d70b44a23136b87c89bb0079452121e6afdecf6b8f4178c19f2caac3dec3662f"

SRCREV = "ced4b72c9b78522113a23b0426f20877af358c62"

S = "${WORKDIR}/git"

do_configure() {
    cd "${S}"
    ./configure
}

do_compile() {
    cd "${S}"
    make
}

do_install() {
    cd "${S}"
    make DESTDIR=${D} PREFIX=/usr install
}

# why three separate steps? -> caching, parallism, ..
# introduce ${S}
