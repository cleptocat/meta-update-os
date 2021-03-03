DESCRIPTION = "Building SWUpdate compound image"

inherit swupdate

SRC_URI = "\
    file://emmcsetup.lua \
    file://sw-description \
"

# images to build before building swupdate image
IMAGE_DEPENDS = "base-image-os"

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "base-image-os"

SWUPDATE_IMAGES_FSTYPES[base-image-os] = ".ext4.gz"