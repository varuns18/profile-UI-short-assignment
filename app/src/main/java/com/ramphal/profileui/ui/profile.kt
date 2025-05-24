package com.ramphal.profileui.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramphal.profileui.R
import com.ramphal.profileui.ui.theme.ProfileUITheme
import com.ramphal.profileui.ui.theme.myFont

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        ProfileAppBar()
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .height(0.dp)
                .weight(1f)
                .background(color = colorResource(R.color.surface))
        ) {
            item {
                Column(
                    modifier = Modifier.background(colorResource(R.color.card_background))
                        .padding(horizontal = 16.dp),
                ) {
                    Spacer(modifier = Modifier.height(32.dp))
                    ProfileHeader()
                    Spacer(modifier = Modifier.height(16.dp))
                    CREDGarageCard()
                    Spacer(modifier = Modifier.height(24.dp))
                    AccountOverviewSection()
                    Spacer(modifier = Modifier.height(16.dp))
                }
                Spacer(modifier = Modifier.height(24.dp))
                YourRewardsAndBenefitsSection()
                Spacer(modifier = Modifier.height(24.dp))
                TransactionsAndSupportSection()
            }
        }
    }
}

@Composable
fun ProfileAppBar() {
    Row(
        modifier = Modifier.height(60.dp)
            .fillMaxWidth()
            .background(color = colorResource(R.color.card_background))
            .padding(start = 24.dp, end = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_arrow_back),
            contentDescription = "go back",
            modifier = Modifier.size(36.dp),
            tint = colorResource(R.color.secondary)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "Profile",
            fontFamily = myFont,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            color = colorResource(R.color.secondary),
            modifier = Modifier.wrapContentHeight()
                .width(0.dp)
                .weight(1f)
        )
        OutlinedButton(
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = colorResource(R.color.card_background),
                contentColor = colorResource(R.color.tertiary)
            ),
            border = BorderStroke(1.dp, colorResource(R.color.tertiary)),
            onClick = {
            // on support click action
        }) {
            Icon(
                painterResource(R.drawable.ic_support_24px),
                contentDescription = "support",
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "support",
                fontFamily = myFont,
            )
        }
    }
}

@Composable
fun ProfileHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
            .padding(start = 8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.profile_pic),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    "Varun S",
                    fontFamily = myFont,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    color = colorResource(R.color.secondary)
                )
                Text(
                    "member since Dec, 2012",
                    fontFamily = myFont,
                    fontWeight = FontWeight.Thin,
                    fontSize = 16.sp,
                    color = colorResource(R.color.tertiary)
                )
            }
        }
        OutlinedIconButton(
            colors = IconButtonColors(
                containerColor = colorResource(R.color.surface),
                contentColor = colorResource(R.color.tertiary),
                disabledContainerColor = colorResource(R.color.surface),
                disabledContentColor = colorResource(R.color.tertiary)
            ),
            border = BorderStroke(1.dp, colorResource(R.color.tertiary)),
            onClick = {
                // on edit click action
            }
        ) {
            Icon(painter = painterResource(R.drawable.ic_edit_24px), contentDescription = "Edit Profile")
        }
    }
}

@Composable
fun CREDGarageCard() {
    OutlinedCard (
        modifier = Modifier.fillMaxWidth().padding(start = 8.dp),
        colors = CardDefaults.cardColors(containerColor = colorResource(R.color.surface)),
        shape = RoundedCornerShape(0),
        onClick = {
            // on CRED Garage card click action
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                OutlinedIconButton(
                    modifier = Modifier.size(36.dp),
                    enabled = false,
                    border = BorderStroke(1.dp, colorResource(R.color.secondary)),
                    onClick = {},
                    colors = IconButtonColors(
                        containerColor = colorResource(R.color.card_background),
                        contentColor = colorResource(R.color.secondary),
                        disabledContainerColor = colorResource(R.color.card_background),
                        disabledContentColor = colorResource(R.color.secondary)
                    )
                ) {
                    Icon(
                        painterResource(R.drawable.ic_car_24px),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp),
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        "get to know your vehicles, inside out",
                        fontFamily = myFont,
                        fontWeight = FontWeight.Thin,
                        fontSize = 12.sp,
                        color = colorResource(R.color.secondary)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            "CRED garage",
                            fontFamily = myFont,
                            fontWeight = FontWeight.Medium,
                            fontSize = 14.sp,
                            color = colorResource(R.color.secondary)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Icon(
                            painterResource(R.drawable.ic_arror_forward),
                            contentDescription = "Go to CRED Garage",
                            tint = colorResource(R.color.secondary),
                            modifier = Modifier.size(28.dp)
                        )

                    }

                }
            }
        }
    }
}

@Composable
fun AccountOverviewSection() {
    Column(modifier = Modifier.fillMaxWidth().padding(start = 8.dp)) {
        Spacer(modifier = Modifier.height(16.dp))
        ProfileListItem(
            icon = ImageVector.vectorResource(R.drawable.ic_credit_card_24px),
            title = "credit score",
            value = "757",
            suggestion = " • REFRESH AVAILABLE",
            onClick = {
                // on credit score click action
            }
        )
        HorizontalDivider()
        ProfileListItem(
            icon = ImageVector.vectorResource(R.drawable.ic_rupee),
            title = "lifetime cashback",
            value = "₹3",
            onClick = {
                // on lifetime cashback click action
            }
        )
        HorizontalDivider()
        ProfileListItem(
            icon = ImageVector.vectorResource(R.drawable.ic_account_balance_24px),
            title = "bank balance",
            value = "check",
            onClick = {
                // on bank balance click action
            }
        )
    }
}

@Composable
fun YourRewardsAndBenefitsSection() {
    Column(modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 16.dp)) {
        Text(
            "YOUR REWARDS & BENEFITS",
            fontFamily = myFont,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = colorResource(R.color.tertiary)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ProfileListItem(
            title = "cashback balance",
            bottomValue = "₹1000",
            onClick = {
                //on cashback balance click action
            }
        )
        HorizontalDivider()
        ProfileListItem(
            title = "coins",
            bottomValue = "26,46,583",
            onClick = {
                //on coins click action
            }
        )
        HorizontalDivider()
        ProfileListItem(
            title = "win upto Rs 1000",
            bottomValue = "refer and earn",
            onClick = {
                //on refer click action
            }
        )
    }
}

@Composable
fun TransactionsAndSupportSection() {
    Column(modifier = Modifier.fillMaxWidth().padding(start = 24.dp, end = 16.dp)) {
        Text(
            "TRANSACTIONS & SUPPORT",fontFamily = myFont,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = colorResource(R.color.tertiary)
        )
        Spacer(modifier = Modifier.height(8.dp))
        ProfileListItem(
            title = "all transactions",
            onClick = {
                //on all transactions click action
            }
        )
    }
}

@Composable
fun ProfileListItem(
    icon: ImageVector? = null,
    title: String,
    bottomValue: String? = null,
    suggestion: String? = null,
    value: String? = null,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp)
            .clickable(
                onClick = onClick
            ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (icon != null) {
                    OutlinedIconButton(
                        modifier = Modifier.size(20.dp),
                        enabled = false,
                        border = BorderStroke(1.dp, colorResource(R.color.tertiary)),
                        onClick = {},
                        colors = IconButtonColors(
                            containerColor = colorResource(R.color.card_background),
                            contentColor = colorResource(R.color.tertiary),
                            disabledContainerColor = colorResource(R.color.card_background),
                            disabledContentColor = colorResource(R.color.tertiary)
                        )
                    ) {
                        Icon(
                            icon,
                            contentDescription = title,
                            modifier = Modifier.size(12.dp),
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))
                }
                Text(
                    title,
                    fontFamily = myFont,
                    fontWeight = FontWeight.Thin,
                    fontSize = 14.sp,
                    color = colorResource(R.color.secondary),
                )
                if (!(suggestion.isNullOrBlank())){
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        suggestion,
                        fontFamily = myFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = colorResource(R.color.primary),
                    )
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (value != null) {
                    Text(
                        value,
                        fontFamily = myFont,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = colorResource(R.color.secondary),
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        painter = painterResource(R.drawable.ic_arror_forward),
                        contentDescription = null,
                        tint = colorResource(R.color.secondary)
                    )
                } else {
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowRight,
                        contentDescription = null,
                        tint = colorResource(R.color.secondary)
                    )
                }
            }
        }
        if (!bottomValue.isNullOrBlank()){
            Text(
                text = bottomValue,
                fontFamily = myFont,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                color = colorResource(R.color.tertiary)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileUITheme {
        ProfileScreen()
    }
}