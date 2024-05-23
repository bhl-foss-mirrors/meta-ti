require linux-ti-staging_6.6.bb

KERNEL_LOCALVERSION:append = "-rt"

# Look in the generic major.minor directory for files
# This will have priority over generic non-rt path
FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-6.6:"

BRANCH = "ti-rt-linux-6.6.y"

SRCREV = "7cceac93947da35755935827cd675925400d0102"

include ${@ 'recipes-kernel/linux/ti-extras-rt.inc' if d.getVar('TI_EXTRAS') else ''}

PV = "6.6.25+git"
