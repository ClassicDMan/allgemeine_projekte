/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class', // <-- wichtig!
  content: [
    "./src/**/*.{html,ts}",
  ],
  theme: {
    screens: {
      'sm': '470px',
      // => @media (min-width: 470px) { ... }

      'md': '768px',
      // => @media (min-width: 768px) { ... }

      'lg': '1024px',
      // => @media (min-width: 1024px) { ... }

      'xl': '1280px',
      // => @media (min-width: 1280px) { ... }

      '2xl': '1536px',
      // => @media (min-width: 1536px) { ... }
    },
    extend: {
      colors:{
        customDark: '#18181b',
      },
    },
  },
  plugins: [],
}

