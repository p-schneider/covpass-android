/*
 * (C) Copyright IBM Deutschland GmbH 2021
 * (C) Copyright IBM Corp. 2021
 */

package de.rki.covpass.app.detail

import com.ibm.health.common.navigation.android.FragmentNav
import com.ibm.health.common.navigation.android.getArgs
import de.rki.covpass.app.R
import de.rki.covpass.sdk.cert.models.CovCertificate
import kotlinx.parcelize.Parcelize

@Parcelize
internal class DummyDetailFragmentNav(var certId: String) : FragmentNav(DummyDetailFragment::class)

/**
 * Fragment for displaying the details of a Certificate.
 */
internal class DummyDetailFragment : DgcEntryDetailFragment() {

    override val certId: String by lazy { args.certId }

    private val args: DummyDetailFragmentNav by lazy { getArgs() }

    override fun getToolbarTitleText(cert: CovCertificate): String =
        getString(R.string.certificates_overview_all_certificates_app_reference_title)

    override fun getHeaderText(): String =
        getString(R.string.certificates_overview_all_certificates_app_reference_title)

    override fun getHeaderAccessibleText(): String =
        getString(R.string.certificates_overview_all_certificates_app_reference_title)

    override fun getDataRows(cert: CovCertificate): List<DataRow> =
        emptyList()
}
